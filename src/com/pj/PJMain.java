package com.pj;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Calendar;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


public class PJMain {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		// TODO Auto-generated method stub

		
				/**
		 * Created by IntelliJ IDEA.
		 * User: ddvmaw
		 * Date: 5/03/2009
		 * Time: 15:02:58
		 * To change this template use File | Settings | File Templates.
		 */
		String originalXmlRequest ="<fsd:FilesystemDocument xmlns:fsd='http://www.qbe.com.au/FileSystemData-2009-02-25/'><Header><OrigApp><Name>EVOLVE</Name><Channel>ELDPANBAT</Channel></OrigApp><TrackingId>PERSONAL_INJURY_AND_ILLNESS_EX_Schedule_1EBA141520PAN_201808082044.pdf</TrackingId></Header><MetadataStorage><MetadataStorageElement><Name>xDocumentAuthor</Name><Value>EvolveBatch</Value></MetadataStorageElement><MetadataStorageElement><Name>xContentGroup</Name><Value>Underwriting</Value></MetadataStorageElement><MetadataStorageElement><Name>xContentType</Name><Value>Notice</Value></MetadataStorageElement><MetadataStorageElement><Name>xContentSubType</Name><Value>RenewalNotice</Value></MetadataStorageElement><MetadataStorageElement><Name>xEffectiveDate</Name><Value>31/07/2019</Value></MetadataStorageElement><MetadataStorageElement><Name>xInitialApplication</Name><Value>Evolve</Value></MetadataStorageElement><MetadataStorageElement><Name>xInitialBusinessObjectNumber</Name><Value>1EBA141520PAN</Value></MetadataStorageElement><MetadataStorageElement><Name>xInitialBusinessObjectType</Name><Value>Policy</Value></MetadataStorageElement><MetadataStorageElement><Name>xInitialTransactionType</Name><Value>Renewal</Value></MetadataStorageElement></MetadataStorage><DistributionMethod><Distribute><Email><Sender><Email>renewals@eldersinsurance.com.au</Email><Name></Name></Sender><Recipients><Recipient><Email>SHRUTHI.PURUSHOTHAMA@ACCENTURE.COM</Email></Recipient><Recipient><Email></Email></Recipient><RecipientCc><Email></Email></RecipientCc><RecipientBcc><Email></Email></RecipientBcc></Recipients><ReplyTo><Email>noreply@eldersinsurance.com.au</Email></ReplyTo><Subject>Elders Renewal Invitation - EBA141520PAN</Subject><Body><Text>Thank you for the opportunity to assist with your insurance needs.Attached is your Renewal Invitation and your associated Product Disclosure Statement which sets out the terms and conditions of your cover. It is important that the insurance cover meets your requirements and that all details are correct.Please read the policy terms and conditions to ensure you are aware of your obligations under the policy. Failure to meet these obligations could prejudice your rights to a claim.If there are any errors, the insurance is not as you require, or there are any matters you wish to discuss, please contact your local Agent* and we will be happy to assist you.　Payment of premiumYou must pay your premium on time to ensure your Policy remains active.You may choose to pay your premium by instalments and if so it must be paid on time as we may cancel the Policy if any instalment of premium has remained unpaid for one month from the date on which payment was due.We will send you a notice giving you details of the action we intend to take and when any cancellation will become effective.It is important to note we may not pay any claim you make under the Policy if your periodic instalment is more than one month overdue.Please advise if you no longer want to receive correspondence via email. Elders Insurance will then send all future correspondence by post unless you instruct us otherwise.Regards,　Elders Insurance*Please refer to page one of your renewal invitation for your local Agents contact details.　Visit eldersinsurance.com.au for all your insurance needs.</Text></Body><MasterDocumentFilename>Elders PAN Renewal Invitation EBA141520PAN 201808082044.pdf</MasterDocumentFilename></Email></Distribute></DistributionMethod><BusinessSupportGroup></BusinessSupportGroup></fsd:FilesystemDocument>";
			String senderValue = "";
		        
		        
		        //String xml = riskInfos[0].getFloodRiskDetails().toString();
		  DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		  DocumentBuilder dBuilder=dbFactory.newDocumentBuilder();
		
		  InputSource is = new InputSource(new StringReader(originalXmlRequest));

		  Document doc= dBuilder.parse(is);
		

		  
		  doc.getDocumentElement().normalize();

		  

		  NodeList nList = doc.getElementsByTagName("Sender");

		  

		  for (int temp = 0; temp < nList.getLength(); temp++) {

		   Node nNode = nList.item(temp);

		   

		   if (nNode.getNodeType() == Node.ELEMENT_NODE) {

		    Element eElement = (Element) nNode;

		    senderValue =  eElement.getElementsByTagName("Email").item(0).getTextContent();
		    
		   }
		  }
		 // LOG.info("SENDER ID IS: " + senderValue);
		  System.out.println("SENDER ID IS: " + senderValue);
		  String subjValue = "";
		  NodeList subjList = doc.getElementsByTagName("Subject");
		    if (subjList != null && subjList.getLength() > 0) {
		       NodeList subjChildList = subjList.item(0).getChildNodes();

		       if (subjChildList != null && subjChildList.getLength() > 0) {
		         subjValue = subjChildList.item(0).getNodeValue();
		       }

		    } 
		  
		   // LOG.info("Subject = " + subjValue);
		    System.out.println("Subject = " + subjValue);
		    String prodCode = subjValue.substring(subjValue.length()-3);
		    
		   // LOG.info("Product Code = " + prodCode);
		    System.out.println("Product Code = " + prodCode);
		        
		  if (senderValue.equalsIgnoreCase("renewals@eldersinsurance.com.au"))
		  {
		   /*String firstPart = originalXmlRequest.substring(0,originalXmlRequest.indexOf("</Attachment>")+13);
		         String lastPart = originalXmlRequest.substring((originalXmlRequest.indexOf("</Attachments>")));
		         
		         String content = "<Attachment>" +
		           "<Url>"+
		                "<UrlLocation>http://sys.content.qbe.com/content/idcplg?IdcService=GET_FILE&amp;dDocName=PRODCT048106&amp;RevisionSelectionMethod=LatestReleased&amp;Rendition=primary</UrlLocation>"+
		              "</Url>"+
		              "<Name>Home Cover Insurance Product Disclosure Statement and Policy Wording.pdf</Name>"+
		            "</Attachment>"+
		   "<Attachment>"+
		              "<Url>"+
		                "<UrlLocation>http://sys.content.qbe.com/content/idcplg?IdcService=GET_FILE&amp;dDocName=PRODCT048106&amp;RevisionSelectionMethod=LatestReleased&amp;Rendition=primary</UrlLocation>"+
		              "</Url>"+
		              "<Name>Home Cover Insurance Product Disclosure Statement and Policy Wording.pdf</Name>"+
		              "</Attachment>";
		         
		         String updatedOringinalXmlRequest = firstPart + content + lastPart;*/
		   
		   addTagInInputXml(doc,prodCode);
		   String updatedOringinalXmlRequest = getStringFromDocument(doc);
		   
		  // LOG.info("UPDATED REQ:"+ updatedOringinalXmlRequest);
		   System.out.println("UPDATED REQ:"+ updatedOringinalXmlRequest);
		  }
		 
	}
		    private static void addTagInInputXml(Document doc,String pCode) {
		        
		    	String urlLocValue="";
		    	String nameVal="";
		    	switch(pCode)
		    	{
		    	case "PAN":
		    		urlLocValue="http://sys.content.qbe.com/content/idcplg?IdcService=GET_FILE&amp;dDocName=PRODCT048106&amp;RevisionSelectionMethod=LatestReleased&amp;Rendition=primary";
		    		nameVal="Home Cover Insurance Product Disclosure Statement and Policy Wording.pdf";
		    		break;
		    	}
		   
		        
		        NodeList nodes = doc.getElementsByTagName("MasterDocumentFilename");

		        
		        Text urlLocationValue = doc.createTextNode(urlLocValue);              
		        Element urlLocation = doc.createElement("UrlLocation"); 
		        urlLocation.appendChild(urlLocationValue);
		        
		        Text useridValue = doc.createTextNode("PEGA_SYS_USER");
		        Element userid = doc.createElement("Userid");
		        userid.appendChild(useridValue);
		        
		        Text passwordValue = doc.createTextNode("pega_prod");
		        Element password = doc.createElement("Password");
		        password.appendChild(passwordValue);
		        
		        Element url = doc.createElement("Url"); 
		        
		        Text nameValue = doc.createTextNode(nameVal);
		        Element name = doc.createElement("Name");  
		        name.appendChild(nameValue);
		        
		        Element attach = doc.createElement("Attachment"); 
		        attach.appendChild(name);
		        
		        Element attachs = doc.createElement("Attachments");
		       
		        url.appendChild(urlLocation);
			    url.appendChild(userid);
			    url.appendChild(password);
			    attach.appendChild(url);
			    attach.appendChild(name);
			    
			    
			   Text urlLocationValue2 = doc.createTextNode(urlLocValue);              
		        Element urlLocation2 = doc.createElement("UrlLocation"); 
		        urlLocation2.appendChild(urlLocationValue2);
		        
		        Text useridValue2 = doc.createTextNode("PEGA_SYS_USER");
		        Element userid2 = doc.createElement("Userid");
		        userid2.appendChild(useridValue2);
		        
		        Text passwordValue2 = doc.createTextNode("pega_prod");
		        Element password2 = doc.createElement("Password");
		        password2.appendChild(passwordValue2);
		        
		        Element url2 = doc.createElement("Url"); 
		        
		        Text nameValue2 = doc.createTextNode(nameVal);
		        Element name2 = doc.createElement("Name");  
		        name2.appendChild(nameValue2);
		        
		        Element attach2 = doc.createElement("Attachment"); 
		        attach.appendChild(name2);
		       
		        url2.appendChild(urlLocation2);
			    url2.appendChild(userid2);
			    url2.appendChild(password2);
			    attach2.appendChild(url2);
			    attach2.appendChild(name2);
			     
			    
			    
			    
			    
			    
			    
			    attachs.appendChild(attach);
			    attachs.appendChild(attach2);
		        
		        /*Text UrlLocationValue1 = doc.createTextNode("http://sys.content.qbe.com/content/idcplg?IdcService=GET_FILE&amp;dDocName=PRODCT048106&amp;RevisionSelectionMethod=LatestReleased&amp;Rendition=primary");              
		        Element urlLocation1 = doc.createElement("UrlLocation"); 
		        urlLocation1.appendChild(UrlLocationValue1);
		        Text UseridValue1 = doc.createTextNode("PEGA_SYS_USER");
		        Element Userid1 = doc.createElement("Userid");
		        Userid1.appendChild(UseridValue1);
		        Text PasswordValue1 = doc.createTextNode("pega_prod");
		        Element Password1 = doc.createElement("Password");
		        Password1.appendChild(PasswordValue1);
		        Element url1 = doc.createElement("Url"); 
		        Text nameValue1 = doc.createTextNode("Home Cover Insurance Product Disclosure Statement and Policy Wording.pdf");
		        Element name1 = doc.createElement("name");  
		        name1.appendChild(nameValue1);
		        Element attach1 = doc.createElement("Attachment"); 
		        attach1.appendChild(name1);
		         */
		        
		       
		      //  attachs.appendChild(attach).appendChild(url).appendChild(urlLocation).appendChild(Userid).appendChild(Password);
		        //attachs.appendChild(attach1).appendChild(url1).appendChild(urlLocation1).appendChild(Userid1).appendChild(Password1);
		        nodes.item(0).getParentNode().insertBefore(attachs, nodes.item(0));
		    
		   
		        
		        
		      /*  updateElementValue(doc);*/
		        
		} 
		    public static String getStringFromDocument(Document doc)
		    {
		        try
		        {
		           DOMSource domSource = new DOMSource(doc);
		           StringWriter writer = new StringWriter();
		           StreamResult result = new StreamResult(writer);
		           TransformerFactory tf = TransformerFactory.newInstance();
		           Transformer transformer = tf.newTransformer();
		           transformer.transform(domSource, result);
		           return writer.toString();
		        }
		        catch(TransformerException ex)
		        {
		           ex.printStackTrace();
		           return null;
		        }
		    } 
		


	}


