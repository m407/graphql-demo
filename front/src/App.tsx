import React from 'react';
import logo from './logo.svg';
import './App.css';
import {useBooksQuery} from "./generated/graphql";

function App(): JSX.Element {
    const {data, loading, error} = useBooksQuery();
    return (
        <div className="App">
            <header className="App-header">
                <img src={logo} className="App-logo" alt="logo"/>
                <p>
                    Edit <code>src/App.tsx</code> and save to reload.
                </p>
                <a
                    className="App-link"
                    href="https://reactjs.org"
                    target="_blank"
                    rel="noopener noreferrer"
                >
                    Learn React
                </a>
                <div>
                    data: {JSON.stringify(data)}
                </div>
                <div>
                    loading: {JSON.stringify(loading)}
                </div>
                <div>
                    error: {error?.message}
                </div>
            </header>
        </div>
    );
}

export default App;
