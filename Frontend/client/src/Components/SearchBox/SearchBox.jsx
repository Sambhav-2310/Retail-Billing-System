import {useState} from "react";

const SearchBox = ({onSearch}) => {
    const [searchText, setSearchText] = useState("");

    const handleInputState = (e) => {
        const text = e.target.value;
        setSearchText(text);
        onSearch(text);
    }

    return (
        <div className="input-group mb-3">
            <input type="text" className="form-control" placeholder="Search Items.." value={searchText} onChange={handleInputState}/>
            <span className="input-group-text bg-warning">
                <i className="bi bi-search"></i>
            </span>
        </div>
    )
}

export default SearchBox;