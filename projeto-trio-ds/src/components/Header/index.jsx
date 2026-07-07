import './style.css'
import NavBar from '../NavBar'

export default function Header() {
  return (
    <header className="header-vitalsaude">
      {/* Colocamos a palavra Saúde dentro de um span com uma classe específica */}
      <h1>Vital <span className="logo-saude">Saúde</span></h1>
      <NavBar />
    </header>
  )
}