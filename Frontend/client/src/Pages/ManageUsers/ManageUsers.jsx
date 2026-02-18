import './ManageUsers.css';
import UserForm from "../../Components/User Form/UserForm.jsx";
import UserList from "../../Components/User List/UserList.jsx";
import {useEffect, useState} from "react";
import toast from "react-hot-toast";
import {fetchUsers} from "../../Service/UserSerive.js";

const ManageUsers = () => {
    const  [users, setUsers] = useState([]);
    const [loading, setLoading] = useState(false);

    useEffect(() => {
        async function loadUsers() {
            try{
                setLoading(true);
                const resopnse = await fetchUsers();
                setUsers(resopnse.data);
            }catch (error) {
                console.error(error);
                toast.error("Unable to load users");
            }finally {
                setLoading(false);
            }
        }
        loadUsers();
    }, []);

    return(
        <div className="users-container text-light">
            <div className="left-column">
                <UserForm setUsers={setUsers} />
            </div>
            <div className="right-column">
                <UserList users={users} setUser={setUsers}/>
            </div>
        </div>
    )
}

export default ManageUsers;