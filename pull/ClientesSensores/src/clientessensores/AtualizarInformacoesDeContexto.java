/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientessensores;


/**
 *
 * @author Jorge
 */
public interface AtualizarInformacoesDeContexto {
    
   
    
    public void atualizarIndicePoluicao(Integer area, int indexPolluition);
    
    public void atualizarFluxoDeVeiculos(Integer area, int vehicleFlow);
    
    public void atualizarVelociadeDoVento(Integer area, int windSpeed);
    
    public void atualizardirecaoDoVento(Integer area, String directionWind);
    
    public void atualizarProbalidadeChuva( Integer area, int willRain);
    
    public void atualizarQuantidadeRuido( Integer area, int noise);
    
    public void atualizarTemeperatura(Integer area, int temperature);
    
    public void atualizarHumidade( Integer area, int humidity);
    
    public void atualizarIncidenciaDeIncendio( Integer area, boolean isFire);
    
    public void atualizarQuantidadeLixo( Integer area, int trash);
    
    public void atualizarAgenteProximo( Integer area, String agentNearName);
    
    
}
