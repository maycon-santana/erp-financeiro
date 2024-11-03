package com.t2ti.siscom.controller.cadastros;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.t2ti.siscom.model.cadastros.Cargo;
import com.t2ti.siscom.services.cadastros.CargoService;

@RestController
@RequestMapping("/cargo")
public class CargoController {

	@Autowired
	private CargoService cargoService;
	
	@GetMapping
	public List<Cargo> listarTodos() {
		return cargoService.listarTodos();
	}
	
	@GetMapping("/{id}")
	public Cargo buscaPorId(@PathVariable Integer id) {
		return cargoService.buscaPorId(id);
	}
	
	@PostMapping
	public Cargo salvaObjeto(@RequestBody Cargo cargo) {
		return cargoService.salvaObjeto(cargo);
	}
	
	@DeleteMapping("/{id}")
	public void excluirObjeto(Integer id) {
		cargoService.excluirObjeto(id);
	}
}
