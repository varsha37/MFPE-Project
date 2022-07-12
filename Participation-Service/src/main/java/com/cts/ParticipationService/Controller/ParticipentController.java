package com.cts.ParticipationService.Controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.ParticipationService.Model.Participent;
import com.cts.ParticipationService.Service.ParticipentService;

@RestController
public class ParticipentController {

	    
	    @Autowired
	    private ParticipentService participentService;

	    @PostMapping("/addParticipation")
	    public Participent addParticipent(@RequestBody Participent participent) {
	        return this.participentService.addParticipent(participent);
	    }
	    
	   @GetMapping("/getParticipation")
	    public List<Participent> getAllParticipations(){
	        
	        return this.participentService.getAllParticipations();
	    }
	   
	   @PutMapping("/updateParticipent")
		public Participent updateParticipent(@RequestBody Participent participent) {
			
			return this.participentService.updateParticipent(participent);
		}
		
	    
	   @GetMapping("/getApprovedParticipations/{status}")
	    @ResponseBody
	    public List<Participent> getApprovedParticipationByStatus(@PathVariable String status) {
	        List<Participent> plist=this.participentService.getApprovedParticipationByStatus(status);
	        return plist;
	    }
	   
	    @GetMapping("/getDeclinedParticipations/{status}")
	    @ResponseBody
	    public List<Participent> getDeclinedParticipationByStatus(@PathVariable String status) {
	        return this.participentService.getDeclinedParticipationByStatus(status);
	    }
	    
	    @GetMapping("/getPendingParticipations/{status}")
	    @ResponseBody
	    public List<Participent> getPendingParticipationByStatus(@PathVariable String status) {
	        return this.participentService.getPendingParticipationByStatus(status);
	    }
}
