package com.yilmazakkan.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yilmazakkan.dao.MusteriDao;
import com.yilmazakkan.model.Musteri;
import com.yilmazakkan.service.MusteriService;

@Service
@Transactional
public class MusteriServiceImpl implements MusteriService {

	@Autowired
	MusteriDao musteriDao;
	
	 public MusteriServiceImpl(){
		
		System.out.println("MusteriServiceImpl");
	}
	
	//-------------------------------------------------------------------------------//
	@Override
	public List<Musteri> findAllMusteri() {
		
		return musteriDao.findAllMusteri();
	}

	@Override
	public List<Musteri> findMusteriler(String musteriAdi) {
	
		return musteriDao.findMusteriler(musteriAdi);
	}

	@Override
	public Musteri findMusteri(long musteriId) {
		
		return musteriDao.findMusteri(musteriId);
	}

	@Override
	public long createMusteri(Musteri musteri) {
		
		return musteriDao.createMusteri(musteri);
	}

	@Override
	public Musteri updateMusteri(Musteri musteri) {
		
		return musteriDao.updateMusteri(musteri);
	}

	@Override
	public void deleteMusteri(long musteriId) {
		
		musteriDao.deleteMusteri(musteriId);

	}

}
