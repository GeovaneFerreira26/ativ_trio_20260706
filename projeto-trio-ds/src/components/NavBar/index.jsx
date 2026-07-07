import './style.css'

export default function NavBar() {
  return (
    <nav className="header-nav">
      <ul className="header-menu-list">
        <li><a href="/">Home</a></li>
        <li><a href="/sobre-nos">Sobre Nós</a></li>
        <li><a href="/cadastre-se">Cadastre-se</a></li>
        <li><a href="/medicos">Médicos</a></li>
        <li><a href="/agendar-consulta">Agendar Consulta</a></li>
        <li><a href="/fale-conosco">Fale Conosco</a></li>
      </ul>
    </nav>
  )
}