$function()
{
	//Solving Active menu problem
	

switch(menu)
{


case 'AboutUs':
	$('#aboutUs').adClass('active');
	break;

case 'Gallary':
	$('#gallary').adClass('active');
	break;
case 'ContactUs':
	$('#contact').adClass('active');
	break;
	default:

	case 'Home':
		$('#home').adClass('active');
		break;

}
}