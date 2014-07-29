  var names = {}; // hash to keep track of what names have been used
  var nodeDataArray;


  //função chamada no "onLoad" da página html
  function getJSONFromProvonService() {
      log("ID_consulta: " + ID_consulta);
      $.support.cors = true;
      $.ajax({
            dataType: "json",
            type: "POST",
            url: serviceURL,
            data: {
                //parâmetro a ser enviado para retornar consulta pelo ID.
                'ID_consulta': ID_consulta,
            },
            error: function (xhr, statusText) {
                    throwError();
                    log("erroGetFeeds");
                    log(xhr, statusText);
                    log(JSON.stringify(xhr, null, "\t"));
            },
            success: function (data) {
                    //checa se veio dados. Podemos implementar aqui uma detecção melhor se assinatura retornar erros customizados quando o ID não existir, por exemplo.
                    if(data.length < 1){
                      throwError();
                    }else{
                      //inicia o gráfico
                      init(data);
                    }

            }
        });
  }
  function throwError(){
    alert("Oops! Algo deu errado. Por favor reinicia a página.")
  }

  function init(_data) {

    nodeDataArray = _data;

    var $ = go.GraphObject.make;  // for conciseness in defining templates

    myDiagram =

      $(go.Diagram, "myDiagram",

        {
		  contentAlignment: go.Spot.Center,
          initialContentAlignment: go.Spot.Center,
          autoScale: go.Diagram.Uniform,
          //isReadOnly: true

		 });



    // Define a simple node template consisting of text followed by an expand/collapse button

    myDiagram.nodeTemplate =

      $(go.Node, "Horizontal",

        { selectionChanged: nodeSelectionChanged },

        $(go.Panel, "Auto",

        		$(go.Shape, { fill: "#0e3e90", stroke: null }),

                $(go.TextBlock,
                    { font: "bold 11pt Helvetica, Arial, sans-serif",
                      stroke: "white",
                      margin: 12,
                      maxSize: new go.Size(160, NaN),
                      wrap: go.TextBlock.WrapFit,
                      editable: true },
                    new go.Binding("text", "text")
                )

        ),

        $("TreeExpanderButton")

      );



    // Define a trivial link template with no arrowhead.

    myDiagram.linkTemplate =

      $(go.Link,

        { selectable: false },

        $(go.Shape));  // the link shape



    // Define the layout for the diagram

    myDiagram.layout =

      $(go.TreeLayout,

        { nodeSpacing: 5, layerSpacing: 30 });


    // create the model for the DOM tree

    myDiagram.model = new go.TreeModel(nodeDataArray);

	myDiagram.addDiagramListener("InitialLayoutCompleted", function(e) {
		log("Renderizado!");
	  });

  }

  // When a Node is clicked, do something.
  function nodeSelectionChanged(node) {

    /*if (node.isSelected) {
    	  log(node.data.name);
        log(node.data.link);
        if(node.data.metadata.tag){
          log(node.data.metadata.tag);
        }else{
          log(node.data.metadata);
        }
    } else {
      //names[node.data.name].style.backgroundColor = "";
    }*/

  }
  ///Função para pegar parâmetros GET
  var QueryString = function () {
    // This function is anonymous, is executed immediately and
    // the return value is assigned to QueryString!
    var query_string = {};
    var query = window.location.search.substring(1);
    var vars = query.split("&");
    for (var i=0;i<vars.length;i++) {
      var pair = vars[i].split("=");
        // If first entry with this name
      if (typeof query_string[pair[0]] === "undefined") {
        query_string[pair[0]] = pair[1];
        // If second entry with this name
      } else if (typeof query_string[pair[0]] === "string") {
        var arr = [ query_string[pair[0]], pair[1] ];
        query_string[pair[0]] = arr;
        // If third or later entry with this name
      } else {
        query_string[pair[0]].push(pair[1]);
      }
    }
      return query_string;
  } ();
  ///
