package com.cts.ParticipationService.Service;

import java.util.List;


import com.cts.ParticipationService.Model.Participent;

public interface ParticipentServiceInterface {
	
	public Participent addParticipent(Participent participent);
	
	public List<Participent> getAllParticipations();
	
	public Participent updateParticipent(Participent participent);
	
	public List<Participent> getApprovedParticipationByStatus(String status);
	
	public List<Participent> getDeclinedParticipationByStatus(String status);
	
	public List<Participent> getPendingParticipationByStatus(String status);

}
