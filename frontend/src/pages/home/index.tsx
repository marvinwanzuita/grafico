import Footer from "components/footer";
import NavBar from "components/navbar";
import { Link } from "react-router-dom";

function Home() {
    return (
        <>
            <NavBar />
            <div className="container">
                <div className="jumbotron">
                    <h1 className="display-4">Gráfico Projeto Spring React</h1>
                    <p className="lead">Analise o desempenho das suas vendas por diferentes perspectivas</p>
                    <hr />
                    <p>Esta aplicação consiste em exibir um dashboard a partir de dados fornecidos por um back end construído com Spring Boot.</p>
                    <Link className="btn btn-primary btn-lg" to="/dashboard">
                        Acessar o dashboard
                    </Link>
                </div>
            </div>
            <Footer />
        </>
    );
}

export default Home;