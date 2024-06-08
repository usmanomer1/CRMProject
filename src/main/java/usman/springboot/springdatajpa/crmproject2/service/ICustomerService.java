package usman.springboot.springdatajpa.crmproject2.service;


import usman.springboot.springdatajpa.crmproject2.model.studentinfo;

import java.util.List;

public interface ICustomerService
{
    public String saveCustomerDetails(studentinfo c);
    public List<studentinfo> getCustomersInfo();
    public studentinfo fetchCxById(Integer id);
    public void deleteCxById(Integer id);


}
