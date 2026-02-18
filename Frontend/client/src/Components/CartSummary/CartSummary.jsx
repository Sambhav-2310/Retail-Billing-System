import './CartSummary.css';
import {useContext} from "react";
import {AppContext} from "../../Context/AppContext.jsx";

const CartSummary = ({customerName, mobileNumber, setMobileNumber, setCustomerName}) => {
    const {cartItems} = useContext(AppContext)
    const totalAmount = cartItems.reduce((total, item) => total+item.price*item.quantity, 0);
    const tax = totalAmount * 0.01;
    const grantTotal = totalAmount + tax;

    return (
        <div className="mt-2">
            <div className="cart-summary-det
            ails">
                <div className="d-flex justify-content-between mb-2">
                    <span className="text-light">Item: </span>
                    <span className="text-light">&#8377;{totalAmount.toFixed(2)}</span>
                </div>
                <div className="d-flex justify-content-between mb-2">
                    <span className="text-light">Tax(1%):</span>
                    <span className="text-light">&#8377;{tax.toFixed(2)}</span>
                </div>
                <div className="d-flex justify-content-between mb-4">
                    <span className="text-light">Total:</span>
                    <span className="text-light">&#8377;{grantTotal.toFixed(2)}</span>
                </div>
            </div>

            <div className="d-flex gap-3">
                <button className="btn btn-success flex-grow-1">
                    Cash
                </button>
                <button className="btn btn-primary flex-grow-1">
                    UPI
                </button>
            </div>
            <div className="d-flex gap-3 mt-3">
                <button className="btn btn-warning flex-grow-1">
                    Place Order
                </button>
            </div>
        </div>
    )
}

export default CartSummary;