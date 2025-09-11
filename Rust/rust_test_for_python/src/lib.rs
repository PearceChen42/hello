use pyo3::prelude::*;
use pyo3::wrap_pyfunction;

/// # A +B 函数
/// X 是 i32类型
/// Y 是 i32类型 
//
#[pyfunction]
fn add(x:i32,y:i32) -> PyResult<i32> {
    return Ok(x +y);
}


#[pymodule]
fn rust_core(m: &Bound<'_, PyModule>) -> PyResult<()> {
    m.add_function(wrap_pyfunction!(add,m)?)?;
    Ok(())
}