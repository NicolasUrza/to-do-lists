// Call the dataTables jQuery plugin

$(document).ready(function(){
    loadToDoList()
    $('#lists').DataTable();
});

async function loadToDoList(){
    const request = await fetch('api/todolists', {
        method: 'GET',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
      });

      const todolists = await request.json();
      let html= "";

      for(let todolist of todolists ){
          let btnDel= '<a href="#"><i class="fas fa-trash"></i></a>';
          let btnEye = '<a href="#"><i class="fas fa-eye"></i></a>'
          let todoHtml='<tr><td> <img src="img/list.png" class="list"> '
            +todolist.name+'</td><td>'+ btnDel +btnEye+'</td></tr>';
          html+= todoHtml;

      }

      document.querySelector('#to-do tbody' ).outerHTML = html;
}

async function createList(){
    let list = {};
    list.name = document.getElementById('list-name').value;
    let lenght = document.getElementById('list-name').value.lenght;
    if (lenght > 40){
        alert("The list's name cannot exceed forty characters")
        return
    };
    list.active = true;
  const request = await fetch('api/todolists', {
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(list)
  });
  loadToDoList();
}

async funtion deleteList(){

}

