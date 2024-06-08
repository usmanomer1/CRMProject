package usman.springboot.springdatajpa.crmproject2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usman.springboot.springdatajpa.crmproject2.dao.ICrmRepo;

import usman.springboot.springdatajpa.crmproject2.model.studentinfo;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService
{

    @Autowired
    ICrmRepo repo;


    @Override
    public String saveCustomerDetails(studentinfo c) {
        return repo.save(c).getName();
    }

    @Override
    public List<studentinfo> getCustomersInfo() {
        return (List<studentinfo>) repo.findAll();
    }

    @Override
    public studentinfo fetchCxById(Integer id) {
        Optional<studentinfo> optional = repo.findById(id);
        return optional.get();
    }

    @Override
    public void deleteCxById(Integer id) {
        repo.deleteById(id);
    }
}
