package com.example.patientsmvc.web;

import com.example.patientsmvc.entities.Patient;
import com.example.patientsmvc.repository.IPatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {

    private IPatientRepository patientRepository;
    @GetMapping(path = "/index")
    //size = nbr de pages
    /* --------La pagination ------------*/
   public  String patients(Model model,
                           @RequestParam(name = "page",defaultValue = "0") int page,
                           @RequestParam(name = "size",defaultValue = "5")int size,
                            @RequestParam(name = "keyword",defaultValue = "")String keyword){
        // à partir de patientRepository, cherche findAll
      // Page<Patient> pagePatients = patientRepository.findAll(PageRequest.of(page,size));
        Page<Patient> pagePatients = patientRepository.findByNomContains(keyword,PageRequest.of(page,size));
        model.addAttribute("listPatients", pagePatients.getContent());
        model.addAttribute("pages", new int[pagePatients.getTotalPages()]);
        //la page que je clique devient la page current
        model.addAttribute("currentPage", page);
        model.addAttribute("keyword",keyword);
       return "patients";
   }
   // conseil utitliser methode Post
   @GetMapping("/delete")
   public String delete (Long id, String keyword, int page){
       patientRepository.deleteById(id);
       //redirection vers index, je suis dans la page current avec keyword
       return "redirect:/index?page="+page+"&keyword="+keyword;
   }
    @GetMapping("/")
    public String home(){
       //redirection vers index
        return "redirect:/index";
    }
    @GetMapping("/patients")
    @ResponseBody
    // ce return List<Patient> se seriazable dans corps de la réponse car il doit convertir en format json
    public List<Patient> listPatients(){
       return patientRepository.findAll();
    }
}
