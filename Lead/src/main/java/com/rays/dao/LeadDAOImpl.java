package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.LeadDTO;

@Repository
public class LeadDAOImpl extends BaseDAOImpl<LeadDTO> implements LeadDAOInt {

	@Override
	public Class<LeadDTO> getDTOClass() {
		return LeadDTO.class;
	}

	@Override
	public List<Predicate> getWhereClause(LeadDTO dto, CriteriaBuilder builder, Root qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!(isEmptyString(dto.getFirstName()))) {

			whereCondition.add(builder.like(qRoot.get("firstName"), dto.getFirstName() + "%"));

		}
		return whereCondition;
	}

}
