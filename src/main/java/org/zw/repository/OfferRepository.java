package org.zw.repository;

import java.util.List;

import org.zw.model.Offer;

/**
 * Created by summer on 2017/5/5.
 */
public interface OfferRepository {

    public Offer findOfferByOfferName(String offerName);
    
    public List<Offer> findOffers(String expression);

}
