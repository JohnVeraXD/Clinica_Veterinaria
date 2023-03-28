package com.Pro_Clinica_Veterinaria.demo.controller;

import com.Pro_Clinica_Veterinaria.demo.entity.Empleado;
import com.Pro_Clinica_Veterinaria.demo.services.EmpleadoService;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.validation.Path;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/Empleado")
public class EmpleadoController {

    private static final Logger log = (Logger) org.slf4j.LoggerFactory.getLogger(Empleado.class);

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping({"/listar"})
    public String listar(Model modelo) {
        modelo.addAttribute("empleados", empleadoService.findAll());
        return "VerEmpleado";
    }

    @GetMapping("/crear")
    public String agregar() {
        return "AgregarEmpleado";
    }

    /*
    @GetMapping("/volver")
    public String VolverMenu() {
        return "redirect:/listar";
    }
     */
    @PostMapping("/guardar")
    public String guardar(@Valid Empleado empleado, Model model, @RequestParam("file") MultipartFile imagen) {

        if (!imagen.isEmpty()) {
            java.nio.file.Path directorio = Paths.get("src//main//resources//static//assets/img");
            String rutalter = directorio.toFile().getAbsolutePath();
            try {
                byte[] byteimg = imagen.getBytes();
                java.nio.file.Path rutacompe = Paths.get(rutalter + "//" + imagen.getOriginalFilename());
                Files.write(rutacompe, byteimg);
                empleado.setFoto(imagen.getOriginalFilename());
            } catch (IOException ex) {
            }
        } else {
            Empleado empleadoOriginal = empleadoService.findOne(empleado.getId());
            empleado.setFoto(empleadoOriginal.getFoto());
            empleado.setEstado(empleadoOriginal.getEstado());
        }

        empleadoService.save(empleado);
        return "redirect:/Empleado/listar";
    }

    @GetMapping("/editar/{id}")
    public String edit(@PathVariable(value = "id") Integer id, Model modelo) {
        Empleado p = empleadoService.findOne(id);
        log.info("Objeto recuperado {}", p);
        modelo.addAttribute("empleado", p);
        return "DetallesEmpleados";
    }

    @GetMapping("/eliminar/{id}")
    public String edit(@PathVariable(value = "id") Integer id) {
        Empleado p = empleadoService.findOne(id);
        log.info("Objeto recuperado {}", p);
        empleadoService.delete(id);
        return "redirect:/Empleado/listar";
    }

    /*
	@GetMapping("/exportarPDF")
	public void exportarListadoDeEmpleadosEnPDF(HttpServletResponse response) throws DocumentException, IOException {
		response.setContentType("application/pdf");
		
		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
		String fechaActual = dateFormatter.format(new Date());
		
		String cabecera = "Content-Disposition";
		String valor = "attachment; filename=Empleados_" + fechaActual + ".pdf";
		
		response.setHeader(cabecera, valor);
		
		List<Empleado> productos = empleadoService.findAll();
		
		PeportPDF exporter = new PeportPDF(productos);
		exporter.exportar(response);
	}
     */
}
