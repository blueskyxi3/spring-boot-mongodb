package org.zw.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import org.zw.model.Offer;
import org.zw.repository.OfferRepository;

/**
 * Created by summer on 2017/5/5.
 */
@Component
public class OfferRepositoryImpl implements OfferRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

	@Override
	public Offer findOfferByOfferName(String offerName) {
		   Query query=new Query(Criteria.where("offer_id").is(30014));
	       return  mongoTemplate.findOne(query , Offer.class);
	}

	@Override
	public List<Offer> findOffers(String expression) {
		   Query query=new Query();
		   query.addCriteria(Criteria.where("offer_name").regex("iphone"));  
		return  mongoTemplate.find(query, Offer.class);
	}
	
	
	
}
