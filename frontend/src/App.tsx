import DataTable from "components/DataTable";
import Footer from "components/Footer";
import Navbar from "components/Navbar";

const App = () => {
  return (
    <>
      <Navbar />
      <div className="container">
        <DataTable />
      </div>
      <Footer />
    </>
  );
};

export default App;
