var ocultos = new Array();

function efeito( id )
{
	var achou = false;

	for ( i in ocultos )
	{
		if( ocultos[i] == id )
		{
			Effect.BlindDown( id );

			ocultos[i] = null;

			achou = true;
		}
	}

	if( achou == false )
	{
		Effect.BlindUp( id );

		ocultos.push( id );
	}
}

function checkUncheckAll( element )
{
	var form = element.form
 
	for( var i = 0; i < form.length; i++ )
	{
		if( form[i].type == 'checkbox' && form[i].name.indexOf( element.name + "." ) >= 0 )
	 	{
			form[i].checked = element.checked;
		}
	}
}