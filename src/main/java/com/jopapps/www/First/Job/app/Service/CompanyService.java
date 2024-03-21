package com.jopapps.www.First.Job.app.Service;
import com.jopapps.www.First.Job.app.Entity.Company;
import com.jopapps.www.First.Job.app.Entity.Job;
import com.jopapps.www.First.Job.app.Entity.Profile;

import java.util.List;

public interface CompanyService {
    public Company registerCompany(Company company);

    Company getCompanyById(Long id);

    void deleteCompanyById(Long id);

    Company updateCompany(Company company);

}
