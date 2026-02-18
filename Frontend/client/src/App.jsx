import MenuBar from "./Components/menuBar/MenuBar.jsx";
import Dashboard from "./Pages/Dashboard/Dashboard.jsx";
import ManageCategory from "./Pages/ManageCategory/ManageCategory.jsx";
import ManageUsers from "./Pages/ManageUsers/ManageUsers.jsx";
import ManageItems from "./Pages/ManageItems/ManageItems.jsx";
import Explore from "./Pages/Explore/Explore.jsx";
import Login from "./Pages/Login/Login.jsx";
import {Toaster} from "react-hot-toast";

import {Routes, Route, useLocation} from "react-router-dom";

const App = () => {
    const location = useLocation();
    return (
        <div>
            {location.pathname !== "/login" && <MenuBar/>}
            <Toaster/>
            <Routes>
                <Route path="/" element={<Dashboard/>}/>
                <Route path="/dashboard" element={<Dashboard/>}/>
                <Route path="/category" element={<ManageCategory/>}/>
                <Route path="/users" element={<ManageUsers/>}/>
                <Route path="/items" element={<ManageItems/>}/>
                <Route path="/explore" element={<Explore/>}/>
                <Route path="/login" element={<Login/>}/>
            </Routes>
        </div>
    );
}

export default App;
