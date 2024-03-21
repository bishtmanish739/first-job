package com.jopapps.www.First.Job.app.Controller;


import com.jopapps.www.First.Job.app.Entity.Company;
import com.jopapps.www.First.Job.app.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompanyController {
    @Autowired
    CompanyService companyService;
    @GetMapping("/company/{id}")
    ResponseEntity<Company> getCompanyById(@PathVariable Long id){
      return ResponseEntity.ok( companyService.getCompanyById(id));
    }
    @PostMapping("/company")
    ResponseEntity<Company> registerCompany(@RequestBody Company company){
        return ResponseEntity.ok( companyService.registerCompany(company));
    }

    @PatchMapping("/company")
    ResponseEntity<Company> updateCompany(@RequestBody Company company){
        return ResponseEntity.ok( companyService.updateCompany(company));
    }
    @DeleteMapping("/company/{id}")
    ResponseEntity<String> deleteCompanyById(@PathVariable Long id){
        try{
            companyService.deleteCompanyById(id);
            return ResponseEntity.ok("Deleted" );
        }
        catch (Exception e){
            return new ResponseEntity<>("Not found",HttpStatusCode.valueOf(404));
        }

    }





}
