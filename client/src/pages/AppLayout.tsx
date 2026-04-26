import {NavLink, Outlet} from "react-router";
import "./AppLayout.css"

export function AppLayout() {
    return <>
        <div className={"layout"}>
        <header>trading-app</header>
        <nav>
            <NavLink to={"/"}>
                Home
            </NavLink>
            <NavLink to={"/stocks"}>
                Stock
            </NavLink>
            <NavLink to={"/stocks/detail"}>
                Detail
            </NavLink>
            <NavLink to={"/stocks/new"}>
                New
            </NavLink>
        </nav>
        <main>
            <Outlet />
        </main>
        </div>
    </>
}