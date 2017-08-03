package main.java.model

/**
 * Created by JammersBlah on 17/07/2017.
 */
data class Customer ( val customerId : Int,
                      val company : String,
                      val contact : String,
                      val deliveryAddress : String,
                      val postcode : String,
                      val email : String,
                      val phoneNumber : String,
                      val source : String )