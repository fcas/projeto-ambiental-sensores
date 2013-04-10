/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientessensores;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

/**
 *
 * @author Jorge
 */
public class ConcreteAtualizarInformaçõesDeContexto implements AtualizarInformacoesDeContexto{
    
    private Client client = Client.create();
    private static String URL_BASE_SERVICO = "http://localhost:8084/MonitoramentoAmbientalCidade/webresources/monitoramento_ambiental/";

    @Override
    public void atualizarIndicePoluicao(Integer area, int indexPolluition) {
        WebResource resource = client.resource(URL_BASE_SERVICO+"atualizar_indice_poluicao/"+area);
        resource.post(indexPolluition);
    }

    @Override
    public void atualizarFluxoDeVeiculos(Integer area, int vehicleFlow) {
        WebResource resource = client.resource(URL_BASE_SERVICO+"atualizar_fluxo_veiculos/"+area);
        resource.post(vehicleFlow);
    }

    @Override
    public void atualizarVelociadeDoVento(Integer area, int windSpeed) {
        WebResource resource = client.resource(URL_BASE_SERVICO+"atualizar_velocidade_vento/"+area);
        resource.post(windSpeed);;
    }

    @Override
    public void atualizardirecaoDoVento(Integer area, String directionWind) {
        WebResource resource = client.resource(URL_BASE_SERVICO+"atualizar_direcao_vento/"+area);
        resource.post(directionWind);
    }

    @Override
    public void atualizarProbalidadeChuva(Integer area, int willRain) {
        WebResource resource = client.resource(URL_BASE_SERVICO+"atualizar_probabilidade_chuva/"+area);
        resource.post(willRain);
    }

    @Override
    public void atualizarQuantidadeRuido(Integer area, int noise) {
        WebResource resource = client.resource(URL_BASE_SERVICO+"atualizar_quantidade_ruido/"+area);
        resource.post(noise);
    }

    @Override
    public void atualizarTemeperatura(Integer area, int temperature) {
        WebResource resource = client.resource(URL_BASE_SERVICO+"atualizar_temperatura/"+area);
        resource.post(temperature);
    }

    @Override
    public void atualizarHumidade(Integer area, int humidity) {
        WebResource resource = client.resource(URL_BASE_SERVICO+"atualizar_humidade/"+area);
        resource.post(humidity);
    }

    @Override
    public void atualizarIncidenciaDeIncendio(Integer area, boolean isFire) {
        WebResource resource = client.resource(URL_BASE_SERVICO+"atualizar_incidencia_incendio/"+area);
        resource.post(isFire);
    }

    @Override
    public void atualizarQuantidadeLixo(Integer area, int trash) {
        WebResource resource = client.resource(URL_BASE_SERVICO+"atualizar_quantidade_lixo/"+area);
        resource.post(trash);
    }

    @Override
    public void atualizarAgenteProximo(Integer area, String agentNearName) {
        WebResource resource = client.resource(URL_BASE_SERVICO+"atualizar_agente_proximo/"+area);
        resource.post(agentNearName);
    }
    
}
