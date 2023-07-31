package com.example.RegisterLogin.Service;

import com.example.RegisterLogin.Config.LoginMesage;
import com.example.RegisterLogin.Dto.EmployeeDTO;
import com.example.RegisterLogin.Dto.LoginDTO;

public interface EmployeeService {

    String addEmployee(EmployeeDTO employeeDTO);
    LoginMesage loginEmployee(LoginDTO loginDTO);
}
