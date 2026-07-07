import './style.css';
import imgHome from '../../assets/img_home.png';

export default function Home() {
    return (
        <div className="home">
           <img className="home-image" src={imgHome} alt="Home Vital Saúde" />
            <h1>
                Seja bem-vindo à <span className="logo-vital">Vital</span> <span className="logo-saude">Saúde</span>
            </h1>
            <p>Seu portal de saúde confiável e acessível.</p>        
        </div>
    )
}