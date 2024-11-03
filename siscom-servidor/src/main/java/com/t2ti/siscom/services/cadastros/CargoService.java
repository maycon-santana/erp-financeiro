package com.t2ti.siscom.services.cadastros;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t2ti.siscom.model.cadastros.Cargo;
import com.t2ti.siscom.repository.cadastros.CargoRepository;

@Service
public class CargoService {
	
	@Autowired
	private CargoRepository cargoRepository;
	
	public List<Cargo> listarTodos() {
		return cargoRepository.findAll();
	}
	
	public Cargo buscaPorId(Integer id) {
		return cargoRepository.findById(id).get();
	}
	
	public Cargo salvaObjeto(Cargo cargo) {
		return cargoRepository.save(cargo);
	}

	public void excluirObjeto(Integer id) {
		Cargo cargo = new Cargo();
		cargo.setId(id);
		cargoRepository.delete(cargo);
	}
	
}
