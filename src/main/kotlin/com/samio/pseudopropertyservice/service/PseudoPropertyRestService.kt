package com.samio.pseudopropertyservice.service

import com.ecommercedemo.common.model.concretion.pseudoProperty.PseudoProperty
import com.ecommercedemo.common.service.abstraction.RestServiceTemplate
import com.ecommercedemo.common.service.annotation.RestServiceFor
import jakarta.transaction.Transactional
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass
import org.springframework.stereotype.Service

@Transactional
@Service
@RestServiceFor(PseudoProperty::class)
@ConditionalOnClass(name = ["org.springframework.data.jpa.repository.JpaRepository"])
class PseudoPropertyRestService(
) : RestServiceTemplate<PseudoProperty>()