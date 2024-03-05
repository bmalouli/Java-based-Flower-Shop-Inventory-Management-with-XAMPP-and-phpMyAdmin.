#### Flower Shop Inventory Management System, developed in Java, with database management created using XAMPP and phpMyAdmin. The application features a user-friendly menu offering options to list inventory, search for flowers, modify flower details, add new flowers, create bouquets, delete flowers and exit the program.

## Program opening Menu:
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/ea76ecd3-467b-4e9c-881b-d37031fc5d7a)

## Inventory list:
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/892434b1-85a8-4a5d-91fb-8650b0e03ead)

## Search for a Flower:
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/a7ca86ca-9693-41a1-aafb-4d2b8520753e)
- Search by ID
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/fbdada9d-604c-4db1-8aed-b403a78a5ea8)
- Search by Name
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/12f3a1a8-b48a-45c7-a994-f9b87ddf0639)
- If information is missing for the search
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/7594b008-4036-4bde-8c16-fb93e03d3146)
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/a7b861d9-16b3-46af-824c-efe522f9d05a)
- The Cancel button resets the search page
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/e91f9b69-362a-42f1-95bb-e8520dcd9bde)

## Edit a flower:
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/08040e82-efc1-4cd8-9bbf-0f0f1ffce008)
- You enter the ID, then press the 'Modifier' button which displays the current information of the flower:
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/98913e4b-6882-48db-9c55-399a5f0d54d5)
- You change this information and click 'Accepter':
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/b7017690-fe60-4b70-9c7f-d3b0c9d5ae62)
- After clicking OK, the page resets
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/3f9067ad-f331-44bb-966f-7771f9cdc74e)
- Verification of the list after modification:
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/28413e76-1807-491e-9f8b-2f6b277d65e7)

## Add a Flower:
- You enter the information for the new flower (the ID increments automatically in the database):
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/435dbe53-fcad-4e2a-8067-96b71d05e626)
- You click on 'Accepter':
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/577238c4-dceb-4f58-9413-2f9d1099e328)
- After clicking OK, the page resets (as does the 'Annuler' button):
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/19a382b0-3983-46fa-8b89-791741a0d25d)
- Verification of the list after addition:
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/de1b868c-89b3-4cc8-a4e3-682696e2404e)

## Creation of a flower bouquet:
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/6af343f2-e163-473e-b8f2-d5261d447be6)
- You enter the ID and quantity for the first flower desired in the bouquet:
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/9c94326f-9b2a-41a1-8f01-c113e8f4c84b)
- The 'Ajouter au bouquet' button adds the flower and its quantity to the JTable and resets the two top fields to empty:
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/29867ba9-b73b-4947-bb1c-b2695743f5bf)
- If a flower has insufficient quantity, an alert message displays indicating the remaining amount:
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/7dc3660a-73ea-4c38-be7c-cd0c47b4acdc)
- Reserving the bouquet sends a confirmation message, then deducts the quantities from the inventory:
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/a84c9b1d-3d18-4422-97ac-032b92cfe0be)
- After clicking OK, an alert message displays for low stocks:
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/718c056d-983c-49c5-a3bd-f1db0f55ecbc)
- Then the page resets:
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/0d8c6f6a-3ffa-4957-b89f-caf02524297e)
- Verification of quantities in the list after reservation:
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/ab8b1e65-3eed-4f0a-b272-3c853d919cc7)
- If attempting to reserve a bouquet when no flowers are present:
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/1e6673f0-cc72-4f91-ab56-3bfb2f21940a)

## Delete a flower:
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/0c695b9e-5214-4f98-8d5b-ce95f8f7fe6a)
- You enter the ID and click on the 'Search' button:
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/95fbae2d-9baa-4a5d-b3f5-b78403a5249e)
- You click on 'Accepter':
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/bc1470c8-436a-4efe-af77-073b3eacc799)
- After clicking OK, the page resets (as does selecting the 'Annuler' button):
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/24932a7e-4694-4c1f-8b5e-efb6d6d9f3cc)
- If the flower you want to delete does not exist:
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/a66f78e2-c447-4ee7-98a6-51677797fa8a)
- Verification in the list after deletion:
![image](https://github.com/bmalouli/Java-based-Flower-Shop-Inventory-Management-with-XAMPP-and-phpMyAdmin./assets/116194037/5f154bf7-efb0-409e-a0ba-ceeac8507c21)

## The Quit button 'Quitter':
closes the connection to the database as well as the program.
