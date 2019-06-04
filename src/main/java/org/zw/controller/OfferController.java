package org.zw.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zw.model.CommonResult;
import org.zw.model.Offer;
import org.zw.repository.OfferRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * Created by zouwei on 2019/06/04.
 */
@Controller
@Api(tags = "OfferController", description = "Offer查询管理")
@RequestMapping("/offer")
public class OfferController {
	
    @Autowired
    private OfferRepository offerDao;

    @ApiOperation("根据表达式查询Offer")
    @RequestMapping(value = "/filter/{expression}", method = RequestMethod.GET)
    @ResponseBody
    public Object search(@PathVariable String expression) {
    	 Offer offer =  offerDao.findOfferByOfferName("xxxx");
        return new CommonResult().success(offer);
    }
    
    @ApiOperation("根据表达式查询Offer2")
    @RequestMapping(value = "/filter1/{expression}", method = RequestMethod.GET)
    @ResponseBody
    public Object search2(@PathVariable String expression) {
    	 List<Offer> offers =  offerDao.findOffers(expression);
        return new CommonResult().success(offers);
    }
}
