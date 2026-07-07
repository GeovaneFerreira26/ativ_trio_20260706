import './style.css';

export default function SobreNos() {
    return (
        <main className="sobrenos-page">
            <section className="sobrenos-banner">
                <h1>Sobre Nós</h1>
                <p>A VITAL SAÚDE está pronta para cuidar de você com responsabilidade e tecnologia.</p>
            </section>

            <section className="sobrenos-content">
                <div className="sobrenos-card">
                    <h2>Nossa missão</h2>
                    <p>Oferecer acesso a atendimentos médicos e agendamentos de consultas de forma simples, segura e acolhedora.</p>
                </div>
                <div className="sobrenos-card">
                    <h2>Quem somos</h2>
                    <p>Somos uma equipe dedicada a conectar pacientes e profissionais de saúde, trazendo informações claras e agilidade no processo.</p>
                </div>
                <div className="sobrenos-card">
                    <h2>Nosso compromisso</h2>
                    <p>Trabalhamos para garantir transparência, empatia e qualidade em cada etapa do atendimento.</p>
                </div>
            </section>
        </main>
    )
}