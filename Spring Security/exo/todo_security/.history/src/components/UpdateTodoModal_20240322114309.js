import React, { useState } from 'react';

function UpdateTodoModal({ todo, onSave, onCancel }) {
  const [title, setT] = useState(todo?.title);
  const [description, setPrice] = useState(todo?.description);
  const [iscompleted, setPrice] = useState(todo?.iscompleted);

  const handleSubmit = (e) => {
    e.preventDefault();
    onSave({id:todo.id, name, price });
  };

  return (
    <div className="modal" style={{ display: 'block', backgroundColor: 'rgba(0,0,0,0.5)' }}>
      <div className="modal-dialog">
        <div className="modal-content">
          <div className="modal-header">
            <h5 className="modal-title">Update Todo</h5>
            <button type="button" className="close" onClick={onCancel}>
              <span>&times;</span>
            </button>
          </div>
          <div className="modal-body">
            <form onSubmit={handleSubmit}>
              <div className="form-group">
                <label>Name</label>
                <input type="text" className="form-control" value={name} onChange={(e) => setName(e.target.value)} />
              </div>
              <div className="form-group">
                <label>Price</label>
                <input type="number" className="form-control" value={price} onChange={(e) => setPrice(e.target.value)} />
              </div>
              <button type="submit" className="btn btn-primary">Save changes</button>
            </form>
          </div>
        </div>
      </div>
    </div>
  );
}

export default UpdateTodoModal;