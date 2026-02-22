import './Explore.css'
import {useContext, useState} from "react";
import {AppContext} from "../../Context/AppContext.jsx";
import DisplayCategory from "../../Components/DisplayCategory/DisplayCategory.jsx";
import DisplayItem from "../../Components/DisplayItem/DisplayItem.jsx";
import CustomerForm from "../../Components/CustomerForm/CustomerForm.jsx";
import CartItems from "../../Components/CartItems/CartItems.jsx";
import CartSummary from "../../Components/CartSummary/CartSummary.jsx";

const Explore = () =>{
    const {categories} = useContext(AppContext);
    const [selectedCategory, setSelectedCategory] = useState("");
    const [customerName, setCustomerName] = useState("");
    const [mobileNumber, setMobileNumber] = useState("");

    return(
        <div className="explore-container text-light">
            <div className="left-column">
                <div className="first-row" style={{overflowY:"auto"}}>
                    <DisplayCategory
                        selectedCategory={selectedCategory}
                        setSelectedCategory={setSelectedCategory}
                        categories={categories}/>
                </div>
                <hr className="horizontal-line"/>
                <div className="second-row" style={{overflowY:"auto"}}>
                    <DisplayItem selectedCategory={selectedCategory}/>
                </div>
            </div>
            <div className="right-column d-flex flex-column">
                <div className="customer-form-container" style={{height: '15%'}}>
                    <CustomerForm
                        customerName={customerName}
                        mobileNumber={mobileNumber}
                        setMobileNumber={setMobileNumber}
                        setCustomerName={setCustomerName}
                    />
                </div>
                <hr className="my-3 text-light"/>
                <div className="cart-items-container" style={{height:'55%',overflowY:'auto'}}>
                    <CartItems />
                </div>
                <div className="cart-summary-container" style={{height:'50%'}}>
                    <CartSummary
                        customerName={customerName}
                        mobileNumber={mobileNumber}
                        setMobileNumber={setMobileNumber}
                        setCustomerName={setCustomerName}
                    />
                </div>
            </div>
        </div>
    )
}

export default Explore;