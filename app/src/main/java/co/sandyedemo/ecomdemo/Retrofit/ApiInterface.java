package co.sandyedemo.ecomdemo.Retrofit;


import co.sandyedemo.ecomdemo.Models.AddToWishlistResponse;
import co.sandyedemo.ecomdemo.Models.CartistResponse;
import co.sandyedemo.ecomdemo.Models.CategoryListResponse;
import co.sandyedemo.ecomdemo.Models.FAQResponse;
import co.sandyedemo.ecomdemo.Models.MyOrdersResponse;
import co.sandyedemo.ecomdemo.Models.Product;
import co.sandyedemo.ecomdemo.Models.RegistrationResponse;
import co.sandyedemo.ecomdemo.Models.SignUpResponse;
import co.sandyedemo.ecomdemo.Models.SliderListResponse;
import co.sandyedemo.ecomdemo.Models.StripeResponse;
import co.sandyedemo.ecomdemo.Models.TermsResponse;
import co.sandyedemo.ecomdemo.Models.UserProfileResponse;
import co.sandyedemo.ecomdemo.Models.WishlistResponse;

import java.util.List;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;

public interface ApiInterface {

    // API's endpoints
    @GET("/app_dashboard/JSON/allproducts.php")
    void getAllProducts(
            Callback<List<Product>> callback);

    @GET("/app_dashboard/JSON/pbyc.php")
    void getCategoryList(Callback<List<CategoryListResponse>> callback);

    @GET("/app_dashboard/JSON/slider.php")
    void getSliderList(Callback<List<SliderListResponse>> callback);

    @GET("/app_dashboard/JSON/faq.php")
    void getFAQ(Callback<FAQResponse> callback);

    @GET("/app_dashboard/JSON/terms.php")
    void getTerms(Callback<TermsResponse> callback);

    @FormUrlEncoded
    @POST("/app_dashboard/JSON/pushadd.php")
    void sendAccessToken(@Field("accesstoken") String accesstoken, Callback<RegistrationResponse> callback);

    @FormUrlEncoded
    @POST("/app_dashboard/JSON/addwishlist.php")
    void addToWishList(@Field("product_id") String product_id, @Field("user_id") String user_id, Callback<AddToWishlistResponse> callback);


    @FormUrlEncoded
    @POST("/app_dashboard/JSON/add_cart.php")
    void addToCart(@Field("product_id") String product_id, @Field("userid") String user_id,
                   @Field("cartquantity") String cartquantity, @Field("size") String size,
                   @Field("color") String color, Callback<AddToWishlistResponse> callback);


    @FormUrlEncoded
    @POST("/app_dashboard/JSON/updatecart.php")
    void updateCart(@Field("cartquantity") String cartquantity, @Field("iteamid") String iteamid, Callback<AddToWishlistResponse> callback);


    @FormUrlEncoded
    @POST("/app_dashboard/JSON/wishcheck.php")
    void checkWishList(@Field("product_id") String product_id, @Field("user_id") String user_id, Callback<AddToWishlistResponse> callback);


    @FormUrlEncoded
    @POST("/app_dashboard/JSON/wishlist.php")
    void getWishList(@Field("user_id") String user_id, Callback<WishlistResponse> callback);



    @FormUrlEncoded
    @POST("/app_dashboard/JSON/product.php")
    void getProductDetails(@Field("product_id") String product_id, Callback<Product> callback);


    @FormUrlEncoded
    @POST("/app_dashboard/JSON/vieworders.php")
    void getMyOrders(@Field("user_id") String user_id, Callback<MyOrdersResponse> callback);


    @FormUrlEncoded
    @POST("/app_dashboard/JSON/viewcart.php")
    void getCartList(@Field("user_id") String user_id, Callback<CartistResponse> callback);


    @FormUrlEncoded
    @POST("/app_dashboard/JSON/userprofile.php")
    void getUserProfile(@Field("user_id") String user_id, Callback<UserProfileResponse> callback);


    @FormUrlEncoded
    @POST("/app_dashboard/JSON/updateprofile.php")
    void updateProfile(@Field("user_id") String user_id,
                       @Field("name") String name,
                       @Field("city") String city,
                       @Field("state") String state,
                       @Field("pincode") String pincode,
                       @Field("local") String local,
                       @Field("flat") String flat,
                       @Field("gender") String gender,
                       @Field("phone") String phone,
                       @Field("landmark") String landmark,
                       Callback<SignUpResponse> callback);

    @FormUrlEncoded
    @POST("/app_dashboard/JSON/resentmail.php")
    void resentEmail(@Field("email") String email, Callback<SignUpResponse> callback);


    @FormUrlEncoded
    @POST("/app_dashboard/JSON/login.php")
    void login(@Field("email") String email, @Field("password") String password, @Field("logintype") String logintype, Callback<SignUpResponse> callback);


    @FormUrlEncoded
    @POST("/app_dashboard/JSON/paystripe.php")
    void stripePayment(@Field("stripeToken") String stripeToken,
                       @Field("total") String total,
                       @Field("user_id") String user_id,
                       @Field("cart_id") String cart_id,
                       @Field("address") String address,
                       @Field("phone") String phone,
                       Callback<StripeResponse> callback);


    @FormUrlEncoded
    @POST("/app_dashboard/JSON/addorders.php")
    void addOrder(@Field("user_id") String user_id,
                  @Field("cart_id") String cart_id,
                  @Field("address") String address,
                  @Field("phone") String phone,
                  @Field("paymentref") String paymentref,
                  @Field("paystatus") String paystatus,
                  @Field("total") String total,
                  @Field("paymentmode") String paymentmode,
                  Callback<SignUpResponse> callback);


    @FormUrlEncoded
    @POST("/app_dashboard/JSON/forgot.php")
    void forgotPassword(@Field("email") String email, Callback<SignUpResponse> callback);


    @FormUrlEncoded
    @POST("/app_dashboard/JSON/register.php")
    void registration(@Field("name") String name, @Field("email") String email, @Field("password") String password, @Field("logintype") String logintype, Callback<SignUpResponse> callback);


}
