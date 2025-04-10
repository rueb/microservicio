package com.carro.service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carro.service.entity.Carro;
import com.carro.service.repository.CarroRepository;

@Service
public class CarroService {

	@Autowired
	private CarroRepository carroRepository;
	
	public List<Carro>getAll(){
		return carroRepository.findAll();
	}
	
	public Carro getCarroById(int id) {
		return carroRepository.findById(id).orElse(null);
	}
	
	public Carro guardar(Carro carro) {
		Carro nuevoCarro = carroRepository.save(carro);
		return nuevoCarro;
	}
	
	public Carro actualizar(int id, Carro carroDetalle) {
		Carro carro = carroRepository.findById(id).orElse(null);
		carro.setMarca(carroDetalle.getMarca());
		carro.setModelo(carroDetalle.getModelo());
		carro.setUsuarioId(carroDetalle.getUsuarioId());
		Carro actualizarCarro = carroRepository.save(carro);
		return actualizarCarro;
	}
	
	public void eliminar(int id) {
		carroRepository.deleteById(id);
	}
	
	public List<Carro>byUsuarioId(int usuarioId){
		return carroRepository.findByUsuarioId(usuarioId);
	}

}
