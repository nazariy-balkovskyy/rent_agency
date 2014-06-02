package com.balkovskyy.rentagency.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.balkovskyy.rentagency.web.domain.Advertisement;
import com.balkovskyy.rentagency.web.dto.AdvertisementDTO;
import com.balkovskyy.rentagency.web.dto.builders.AdvertisementDTOBuilder;
import com.balkovskyy.rentagency.web.services.AdvertisementService;
import com.balkovskyy.rentagency.web.services.PhotoService;

@Controller
@RequestMapping("/advertisements")
public class AdvertisementController {

	@Autowired
	private AdvertisementService advertisementService;

	@Autowired
	private PhotoService photoService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public List<AdvertisementDTO> getAdvertisements() {
		List<Advertisement> list = advertisementService.findAllAdvertisements();
		for (Advertisement adv : list) {
			adv.setPhoto(photoService.getDefaultPhotoByAdvertisementId(adv
					.getId()));
		}
		return AdvertisementDTOBuilder.totoAdvertisementListDTO(list);
	}

	@RequestMapping(value = "/city/{id}", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public List<AdvertisementDTO> getAdvertisementsByCity(@PathVariable Long id) {
		List<Advertisement> list = advertisementService
				.findAdvertisementsByCity(id);
		for (Advertisement adv : list) {
			adv.setPhoto(photoService.getDefaultPhotoByAdvertisementId(adv
					.getId()));
		}
		return AdvertisementDTOBuilder.totoAdvertisementListDTO(list);
	}

	@RequestMapping(value = "/region/{id}", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public List<AdvertisementDTO> getAdvertisementsByCityRegion(
			@PathVariable Long id) {
		List<Advertisement> list = advertisementService
				.findAdvertisementsByCityRegion(id);
		for (Advertisement adv : list) {
			adv.setPhoto(photoService.getDefaultPhotoByAdvertisementId(adv
					.getId()));
		}
		return AdvertisementDTOBuilder.totoAdvertisementListDTO(list);
	}

	@RequestMapping(value = "/renttype/{id}", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public List<AdvertisementDTO> getAdvertisementsByRentType(
			@PathVariable Long id) {
		List<Advertisement> list = advertisementService
				.findAdvertisementsByRentType(id);
		for (Advertisement adv : list) {
			adv.setPhoto(photoService.getDefaultPhotoByAdvertisementId(adv
					.getId()));
		}
		return AdvertisementDTOBuilder.totoAdvertisementListDTO(list);
	}

	@RequestMapping(value = "/region/{rid}/renttype/{id}", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public List<AdvertisementDTO> getAdvertisementsByRegionWithType(
			@PathVariable(value = "rid") Long rid,
			@PathVariable(value = "id") Long id) {
		List<Advertisement> list = advertisementService
				.findAdvertisementsByCityRegionWithType(rid, id);
		for (Advertisement adv : list) {
			adv.setPhoto(photoService.getDefaultPhotoByAdvertisementId(adv
					.getId()));
		}
		return AdvertisementDTOBuilder.totoAdvertisementListDTO(list);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public AdvertisementDTO getAdvertisementById(@PathVariable Long id) {
		return AdvertisementDTOBuilder.toAdvertisementDTO(advertisementService
				.findAdvertisementById(id));
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public AdvertisementDTO addAdvertisement(@RequestBody AdvertisementDTO dto) {
		Advertisement adv = new Advertisement();
		adv.setName(dto.getName());
		adv.setDescription(dto.getDescription());

		return dto;
	}

	@RequestMapping(value = "", method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.OK)
	public AdvertisementDTO updateAdvertisement(
			@RequestBody AdvertisementDTO dto) {
		Advertisement adv = new Advertisement();
		adv.setName(dto.getName());
		adv.setDescription(dto.getDescription());

		return dto;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.OK)
	public void deleteAdvertisementById(@PathVariable Long id) {
		advertisementService.deleteAdvertisement(id);
	}
}
