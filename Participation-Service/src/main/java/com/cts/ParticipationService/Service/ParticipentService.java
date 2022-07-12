package com.cts.ParticipationService.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.ParticipationService.Model.Participent;
import com.cts.ParticipationService.Repository.ParticipentRepository;

@Service
public class ParticipentService implements ParticipentServiceInterface{
	
	@Autowired
	private ParticipentRepository participentRepository;

	public ParticipentService() {
		
	}
	
	@Override
	public Participent addParticipent(Participent participent) {
		participentRepository.save(participent);
		
		return participent;
	}

	@Override
	public List<Participent> getAllParticipations() {
		return participentRepository.findAll();
	}

	

	public List<Participent> getApprovedParticipationByStatus(String status) {
		List<Participent> plist= this.participentRepository.findByStatus(status);
		return plist;
	}

	public List<Participent> getDeclinedParticipationByStatus(String status) {
		List<Participent> plist= this.participentRepository.findByStatus(status);
		return plist;
	}

	public List<Participent> getPendingParticipationByStatus(String status) {
		List<Participent> plist= this.participentRepository.findByStatus(status);
		return plist;
	}

	

	public Participent updateParticipent(Participent participent) {
		participentRepository.save(participent);
		return participent;
	}
	
}