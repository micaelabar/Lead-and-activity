
package com.example.CRM.service


import com.example.CRM.dto.CustomerDTO
import com.example.CRM.mapper.Customer

import com.example.CRM.repository.CustomerRepository
import org.springframework.stereotype.Service

@Service
class CustomerService(private val customerRepository: CustomerRepository) {

    fun getAllCustomers(): List<CustomerDTO> {
        return customerRepository.findAll().map { Customer.toDto(it) }
    }

    fun createCustomer(customerDto: CustomerDTO): CustomerDTO {
        val customer = Customer.toEntity(customerDto)
        val savedCustomer = customerRepository.save(customer)
        return Customer.toDto(savedCustomer)
    }

    fun getCustomerById(id: Long): CustomerDTO{
        val customer = customerRepository.findById(id).orElseThrow { Exception("Customer not found") }
        return Customer.toDto(customer)
    }
}
