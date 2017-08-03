package main.java.model

import java.util.*

/**
 * Created by JammersBlah on 17/07/2017.
 */
data class Order (val orderId : Int,
                  val date: java.util.Date,
                  val expectedDeliveryDate : java.util.Date)