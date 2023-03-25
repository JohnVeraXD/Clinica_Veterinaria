package com.Pro_Clinica_Veterinaria.demo.controller;

import com.Pro_Clinica_Veterinaria.demo.entity.Empleado;
import com.Pro_Clinica_Veterinaria.demo.services.EmpleadoService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
//@RequestMapping("/Empleado")
public class EmpleadoController {

    private static final Logger log = (Logger) org.slf4j.LoggerFactory.getLogger(Empleado.class);

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping({"/empleado"})
    public String listar(Model modelo) {
        modelo.addAttribute("empleados", empleadoService.findAll());

        return "VerUsuario";
    }

    @GetMapping("/create")
    public String agregar() {
        return "create";
    }

    /*
    @GetMapping("/volver")
    public String VolverMenu() {
        return "redirect:/listar";
    }
    */

    @PostMapping("/save")
    public String guardar(Empleado empleado) {
        empleadoService.save(empleado);
        return "redirect:/listar";
    }

    @GetMapping("/editar/{id}")
    public String edit(@PathVariable(value = "id") Integer id, Model modelo) {
        Empleado p = empleadoService.findOne(id);
        log.info("Objeto recuperado {}", p);
        modelo.addAttribute("empleado", p);
        return "editar";
    }

    @GetMapping("/eliminar/{id}")
    public String edit(@PathVariable(value = "id") Integer id) {
        Empleado p = empleadoService.findOne(id);
        log.info("Objeto recuperado {}", p);
        empleadoService.delete(id);
        return "redirect:/listar";
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
