import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import App from './pages/App.tsx'
import {BrowserRouter, Route, Routes} from "react-router";
import {AppLayout} from "./pages/AppLayout.tsx";
import StockList from "./pages/stock/StockList.tsx";
import StockDetail from "./pages/stock/StockDetail.tsx";
import StockNew from "./pages/stock/StockNew.tsx";

createRoot(document.getElementById('root')!).render(
  <StrictMode>
      <BrowserRouter>
          <Routes>
              <Route path={"/"} element={<AppLayout />}>
                  <Route index element={<App />}></Route>
                  <Route path={"/stocks"} element={<StockList />}></Route>
                  <Route path={"/stocks/detail"} element={<StockDetail />}></Route>
                  <Route path={"/stocks/new"} element={<StockNew />}></Route>
              </Route>
          </Routes>
      </BrowserRouter>

  </StrictMode>,
)
