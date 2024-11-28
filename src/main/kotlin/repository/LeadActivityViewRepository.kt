package com.example.CRM.repository

import com.example.CRM.Entity.LeadCustomerView
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.JpaRepository

@Repository
interface LeadActivityViewRepository : JpaRepository<LeadCustomerView, Long> {

    @Query("SELECT lav FROM LeadCustomerView lav")
    fun findAllLeadActivities(): List<LeadCustomerView>

    @Query("SELECT lav FROM LeadCustomerView lav WHERE lav.activityId = :id")
    fun findLeadActivityById(@Param("id") id: Long): LeadCustomerView?
}