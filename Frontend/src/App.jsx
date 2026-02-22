import MenuBar from "./Components/menuBar/MenuBar.jsx";
import Dashboard from "./Pages/Dashboard/Dashboard.jsx";
import ManageCategory from "./Pages/ManageCategory/ManageCategory.jsx";
import ManageUsers from "./Pages/ManageUsers/ManageUsers.jsx";
import ManageItems from "./Pages/ManageItems/ManageItems.jsx";
import Explore from "./Pages/Explore/Explore.jsx";
import Login from "./Pages/Login/Login.jsx";
import {Toaster} from "react-hot-toast";

import {Routes, Route, useLocation, Navigate} from "react-router-dom";
import OrderHistory from "./Pages/Order History/OrderHistory.jsx";
import {useContext} from "react";
import {AppContext} from "./Context/AppContext.jsx";
import NotFound from "./Pages/NotFound/NotFound.jsx";

const App = () => {
    const location = useLocation();
    const {auth} = useContext(AppContext);

    const LoginRoute = ({element}) => {
        if(auth.token){
            return <Navigate to="/dashboard"/>
        }

        return element;
    }

    const ProtectedRoute = ({element, allowedRoles}) => {
        if(!auth.token){
            return <Navigate to="/login" replace />
        }

        if(allowedRoles && !allowedRoles.includes(auth.role)){
            return <Navigate to="/dashboard" replace />
        }

        return element;
    }

    return (
        <div>
            {location.pathname !== "/login" && <MenuBar/>}
            <Toaster/>
            <Routes>
                <Route path="/dashboard" element={<Dashboard/>}/>
                <Route path="/explore" element={<Explore/>}/>
                {/*Admin Only Routes*/}
                <Route path="/category" element={<ProtectedRoute element={<ManageCategory/>} allowedRoles={['ROLE_ADMIN']}/>}/>
                <Route path="/users" element={<ProtectedRoute element={<ManageUsers />} allowedRoles={['ROLE_ADMIN']}/> }/>
                <Route path="/items" element={<ProtectedRoute element={<ManageItems/>} allowedRoles={['ROLE_ADMIN']}/> }/>

                <Route path="/login" element={<LoginRoute element={<Login />} />} />
                <Route path="/orders" element={<OrderHistory/>}/>
                <Route path="/" element={<Dashboard />} />
                <Route path="*" element={<NotFound />} />
            </Routes>
        </div>
    );
}

export default App;
