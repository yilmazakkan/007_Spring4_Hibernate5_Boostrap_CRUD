package com.yilmazakkan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yilmazakkan.model.Musteri;
import com.yilmazakkan.service.MusteriService;



@Controller
public class MusteriController {
	
	@Autowired
	private MusteriService musteriService;
	
	public MusteriController() {
		System.out.println("MusteriController");
	}
	
	@RequestMapping(value="newMusteri", method= RequestMethod.GET)
	public ModelAndView newMusteri(@ModelAttribute Musteri musteri) {
		return new ModelAndView("musteriForm");
	}
	
	@RequestMapping(value="editMusteri", method= RequestMethod.GET)
	public ModelAndView updateMusteri(@RequestParam long musteriId, @ModelAttribute Musteri musteri) {
		musteri= musteriService.findMusteri(musteriId);
		return new ModelAndView("musteriForm","MusteriObject",musteri);
	}
	
	@RequestMapping(value="saveMusteri", method= RequestMethod.POST)
	public ModelAndView saveMusteri(@ModelAttribute Musteri musteri) {
		
		if (musteri.getMusteriId() == 0) {
			
			musteriService.createMusteri(musteri);
		} else {
			musteriService.updateMusteri(musteri);
		}
		
		return new ModelAndView("redirect:findAllMusteri");
	}
	
	@RequestMapping(value= {"findAllMusteri","/ListAllMusteri"}, method=RequestMethod.GET)
	public ModelAndView findAllMusteri() {
		List<Musteri> musteriList = musteriService.findAllMusteri();
		
		return new ModelAndView("musteriList","musteriList",musteriList);
	}
	
	
	@RequestMapping(value="deleteMusteri", method= RequestMethod.GET)
	public ModelAndView deleteMusteri(@RequestParam long musteriId) {
		musteriService.deleteMusteri(musteriId);
		return new ModelAndView("redirect:findAllMusteri");
	}
	
	@RequestMapping(value="searchMusteri", method= RequestMethod.GET)
	public ModelAndView searchMusteri(@RequestParam ("searchAdi") String searchAdi) {	
		List<Musteri> musteriList=musteriService.findMusteriler(searchAdi);
		return new ModelAndView("musteriList","musteriList",musteriList);
	}
	
	
	


}
