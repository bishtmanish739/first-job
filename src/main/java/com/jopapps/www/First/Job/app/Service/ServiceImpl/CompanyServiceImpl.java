package com.jopapps.www.First.Job.app.Service.ServiceImpl;

import com.jopapps.www.First.Job.app.Entity.Company;
import com.jopapps.www.First.Job.app.Repository.CompanyRepository;
import com.jopapps.www.First.Job.app.Service.CompanyService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    CompanyRepository companyRepository;
    @Override
    public Company registerCompany(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public Company getCompanyById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteCompanyById(Long id) {
        try{
            companyRepository.deleteById(id);
        }
        catch (Exception e){
            throw  e;

        }

    }

    @Override
    public Company updateCompany(Company company) {
        return companyRepository.save(company);
    }
}
