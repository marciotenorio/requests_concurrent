# Requests Concurrent

### Disciplina: Programação Concorrente - IMD/UFRN
### Prof. Dr. Everton Ranielly De Sousa Cavalcante
#### Discentes: Márcio Tenório Júnior e Roberto Manaia dos Santos Junior

# Descrição
O objetivo deste trabalho é analisar de forma empírica o desempenho de um programa concorrente
implementado utilizando threads com relação a tempo de execução em comparação a sua respectiva
versão sequencial/iterativa.

# Documento sobre a análise
[Trabalho Prático - Sequencial e Concorrente.pdf](https://github.com/marciotenorio/requests_sequential/files/10429397/Trabalho.Pratico.-.Sequencial.e.Concorrente.pdf)

# Resultados

![image](https://user-images.githubusercontent.com/32425824/212763450-d8262039-c470-4f06-b5f3-9954428bf85d.png)


![image](https://user-images.githubusercontent.com/32425824/212763685-d0988d1e-0d75-46b8-9f6a-166b6b9fa009.png)


# Conclusão

Nesse cenário específico da geração massiva de requisições, desde cedo podemos observar uma grande disparidade entre as abordagens. Logo no início a abordagem concorrente já começa tendo o dobro do desempenho e quanto maior o número de requisições, maior o desempenho da abordagem concorrente sobre a sequencial. No nosso último cenário (quinhentas requisições) obtivemos a conclusão de que o programa concorrente foi trinta e duas vezes mais rápido que o sequencial, mostrando toda a vantagem da criação de threads por requisição.


O speed up foi um critério bastante interessante de ser utilizado, tendo em vista a proporção tomada desde o início. A partir de cem requisições  os ganhos de speed up de uma versão comparada com a outra foram muito significativos, sendo assim tendo mais uma métrica evidenciando como uma abordagem concorrente se sobressai com relação a sequencial neste cenário.


