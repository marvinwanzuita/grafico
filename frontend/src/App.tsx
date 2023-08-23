import Footer from "./components/footer";
import NavBar from "./components/navbar";
import DataTable from "./components/datatable";
import BarChart from "components/barchart";
import DonutChart from "./components/donutchart";

function App() {
  return (
    <>
      <NavBar />
      <div className="container text-primary px-3">
        <h1>Dashboard de vendas</h1>
        <div className="row px-3">

          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxa de sucesso</h5>
            <BarChart/>
          </div>

          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxa de sucesso</h5>
            <DonutChart/>
          </div>

        </div>

        <div className="py-3">
          <h2 className="text-primary">Todas as vendas</h2>
        </div>
        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
